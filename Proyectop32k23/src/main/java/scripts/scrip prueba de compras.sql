CREATE SCHEMA IF NOT EXISTS `proyectop3` DEFAULT CHARACTER SET utf8 ;
USE `proyectop3` ;

CREATE TABLE Proveedor (
  id_proveedor INTEGER PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  direccion VARCHAR(100) NOT NULL
);

CREATE TABLE Compra (
  id_compra INTEGER PRIMARY KEY,
  id_proveedor INTEGER NOT NULL,
  fecha_compra DATE NOT NULL,
  total_compra DECIMAL(10, 2) NOT NULL,
  FOREIGN KEY (id_proveedor) REFERENCES Proveedor(id_proveedor)
);

CREATE TABLE Producto (
  id_producto INTEGER PRIMARY KEY,
  nombre_producto VARCHAR(50) NOT NULL,
  precio_unitario DECIMAL(10, 2) NOT NULL,
  existencias_total int (10) NOT NULL
);

CREATE TABLE Factura (
  id_factura INTEGER PRIMARY KEY,
  id_compra INTEGER NOT NULL,
  fecha_factura DATE NOT NULL,
  total_factura DECIMAL(10, 2) NOT NULL,
  FOREIGN KEY (id_compra) REFERENCES Compra(id_compra)
);

CREATE TABLE Compra_Producto (
  id_compra INTEGER NOT NULL,
  id_producto INTEGER NOT NULL,
  cantidad INTEGER NOT NULL,
  PRIMARY KEY (id_compra, id_producto),
  FOREIGN KEY (id_compra) REFERENCES Compra(id_compra),
  FOREIGN KEY (id_producto) REFERENCES Producto(id_producto)
);

CREATE TABLE Clasificacion (
id_clasificacion INTEGER PRIMARY KEY,
nombre_clasificacion VARCHAR(50) NOT NULL
);

CREATE TABLE Bodega (
id_bodega INTEGER PRIMARY KEY,
nombre_bodega VARCHAR(50) NOT NULL,
direccion_bodega VARCHAR(100) NOT NULL
);

CREATE TABLE Orden_Compra (
id_orden_compra INTEGER PRIMARY KEY,
id_proveedor INTEGER NOT NULL,
fecha_orden_compra DATE NOT NULL,
total_orden_compra DECIMAL(10, 2) NOT NULL,
FOREIGN KEY (id_proveedor) REFERENCES Proveedor(id_proveedor)
);

CREATE TABLE Detalle_Compra (
id_detalle_compra INTEGER PRIMARY KEY,
id_orden_compra INTEGER NOT NULL,
id_producto INTEGER NOT NULL,
cantidad INTEGER NOT NULL,
precio_unitario DECIMAL(10, 2) NOT NULL,
id_bodega INTEGER NOT NULL,
id_clasificacion INTEGER NOT NULL,
FOREIGN KEY (id_orden_compra) REFERENCES Orden_Compra(id_orden_compra),
FOREIGN KEY (id_producto) REFERENCES Producto(id_producto),
FOREIGN KEY (id_bodega) REFERENCES Bodega(id_bodega),
FOREIGN KEY (id_clasificacion) REFERENCES Clasificacion(id_clasificacion)
);

CREATE TABLE Detalle_Compra_Producto (
id_detalle_compra INTEGER NOT NULL,
id_producto INTEGER NOT NULL,
PRIMARY KEY (id_detalle_compra, id_producto),
FOREIGN KEY (id_detalle_compra) REFERENCES Detalle_Compra(id_detalle_compra),
FOREIGN KEY (id_producto) REFERENCES Producto(id_producto)
);
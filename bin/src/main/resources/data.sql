
CREATE TABLE IF NOT EXISTS ITEMS (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  descripcion VARCHAR(255),
  nombre VARCHAR(255),
  category VARCHAR(255)
);
INSERT INTO Items (descripcion, nombre, category) VALUES
('Producto de alta calidad', 'Reloj inteligente', 'Electrónica'),
('Artículo de uso diario', 'Camiseta de algodón', 'Ropa'),
('Herramienta profesional', 'Taladro inalámbrico', 'Herramientas'),
('Accesorio de moda', 'Gafas de sol', 'Accesorios'),
('Dispositivo electrónico', 'Computadora portátil', 'Informática'),
('Juguete educativo', 'Rompecabezas de madera', 'Juguetes'),
('Equipo deportivo', 'Bicicleta de montaña', 'Deportes'),
('Elemento de decoración', 'Jarrón de cerámica', 'Hogar'),
('Instrumento musical', 'Guitarra acústica', 'Música'),
('Utensilio de cocina', 'Batidora de mano', 'Cocina'),
('Producto de alta calidad', 'Aspiradora robot', 'Electrónica'),
('Artículo de uso diario', 'Pantalón vaquero', 'Ropa'),
('Herramienta profesional', 'Sierra circular', 'Herramientas'),
('Accesorio de moda', 'Sombrero de paja', 'Accesorios'),
('Dispositivo electrónico', 'Tableta digital', 'Informática'),
('Juguete educativo', 'Cubo Rubik', 'Juguetes'),
('Equipo deportivo', 'Balón de fútbol', 'Deportes'),
('Elemento de decoración', 'Florero de cristal', 'Hogar'),
('Instrumento musical', 'Piano eléctrico', 'Música'),
('Utensilio de cocina', 'Cafetera de uso doméstico', 'Cocina');
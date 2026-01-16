package edu.miguel.gonzalez.actividad1.data;


    public class Vehiculo {
        private int id;
        private String marca;
        private String modelo;
        private int anio;
        private double precio;

        public Vehiculo(int id, String marca, String modelo, int anio, double precio) {
            if (id <= 0) {
                throw new IllegalArgumentException("El ID debe ser mayor a 0");
            }
            if (marca == null || marca.trim().isEmpty()) {
                throw new IllegalArgumentException("La marca no puede estar vacía");
            }
            if (modelo == null || modelo.trim().isEmpty()) {
                throw new IllegalArgumentException("El modelo no puede estar vacío");
            }
            if (anio < 1900) {
                throw new IllegalArgumentException("El año debe ser mayor a 1900");
            }
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo");
            }

            this.id = id;
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
            this.precio = precio;
        }

        public int getId() {
            return id;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getAnio() {
            return anio;
        }

        public double getPrecio() {
            return precio;
        }

        @Override
        public String toString() {
            return String.format("ID: %d | %s %s (%d) - $%.2f", id, marca, modelo, anio, precio);
        }
    }


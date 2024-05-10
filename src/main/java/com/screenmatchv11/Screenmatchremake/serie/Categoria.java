package com.screenmatchv11.Screenmatchremake.serie;

public static Categoria fromString(String text) {
    for (Categoria categoria : Categoria.values()) {
        if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
            return categoria;
        }
    }
    throw new IllegalArgumentException("Ninguna categoria encontrada: " + text);
}

package com.screenmatchv11.Screenmatchremake.principal;

import com.screenmatchv11.Screenmatchremake.model.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {
    private void mostrarSeriesBuscadas() {
        List<Serie> series = new ArrayList<>();
        series = datosSeries.stream()
                .map(d -> new Serie(d))
                .collect(Collectors.toList());
    }
}

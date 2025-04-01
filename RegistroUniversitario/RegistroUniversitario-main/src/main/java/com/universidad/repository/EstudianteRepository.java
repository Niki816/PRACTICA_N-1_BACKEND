package com.universidad.repository;

import com.universidad.model.Estudiante;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class EstudianteRepository {
    private final Map<Long, Estudiante> estudiantes = new ConcurrentHashMap<>();
    private final AtomicLong idContador = new AtomicLong(1);

    public Estudiante save(Estudiante estudiante) {
        if (estudiante.getId() == null) {
            estudiante.setId(idContador.getAndIncrement());
        }
        estudiantes.put(estudiante.getId(), estudiante);
        return estudiante;
    }

    public List<Estudiante> findAll() {
        return new ArrayList<>(estudiantes.values());
    }

    public Estudiante findById(Long id) {
        return estudiantes.get(id);
    }

    public void deleteById(Long id) {
        estudiantes.remove(id);
    }

    public void init() {
        Estudiante estudiante1 = Estudiante.builder()
                .nombre("Carlos")
                .apellido("Ramírez")
                .email("carlos.ramirez@example.com")
                .fechaNacimiento(LocalDate.of(1999, 3, 10))
                .numeroInscripcion("S001")
                .build();

        Estudiante estudiante2 = Estudiante.builder()
                .nombre("Lucía")
                .apellido("Fernández")
                .email("lucia.fernandez@example.com")
                .fechaNacimiento(LocalDate.of(2002, 7, 5))
                .numeroInscripcion("S002")
                .build();

        Estudiante estudiante3 = Estudiante.builder()
                .nombre("David")
                .apellido("Gómez")
                .email("david.gomez@example.com")
                .fechaNacimiento(LocalDate.of(2000, 11, 20))
                .numeroInscripcion("S003")
                .build();

        Estudiante estudiante4 = Estudiante.builder()
                .nombre("Ana")
                .apellido("Martínez")
                .email("ana.martinez@example.com")
                .fechaNacimiento(LocalDate.of(2001, 4, 17))
                .numeroInscripcion("S004")
                .build();

        Estudiante estudiante5 = Estudiante.builder()
                .nombre("Fernando")
                .apellido("López")
                .email("fernando.lopez@example.com")
                .fechaNacimiento(LocalDate.of(1998, 12, 2))
                .numeroInscripcion("S005")
                .build();

        save(estudiante1);
        save(estudiante2);
        save(estudiante3);
        save(estudiante4);
        save(estudiante5);
    }

}

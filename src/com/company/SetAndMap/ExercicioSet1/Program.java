package com.company.SetAndMap.ExercicioSet1;

import com.company.SetAndMap.ExercicioSet1.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Program {

    static final String CAMINHO_DO_ARQUIVO = "Arquivos\\logsEntrada.txt";
    public static void main(String[] args) {

        String path = CAMINHO_DO_ARQUIVO;

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();

            String lineArq = br.readLine();
            while (lineArq != null) {

                String[] fields = lineArq.split(" ");
                set.add(new LogEntry(fields[0], Date.from(Instant.parse(fields[1]))));

                lineArq = br.readLine();
            }
            System.out.println("Total Users: " + set.size());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

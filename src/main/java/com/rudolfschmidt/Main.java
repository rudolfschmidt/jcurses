package com.rudolfschmidt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static com.rudolfschmidt.jcurses.Curses.*;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("starting...");
		initscr();
		raw();

		final List<Path> files = Files.list(Paths.get(".")).collect(Collectors.toList());

		for (Path file : files) {
			printw(String.format("%s%n", file.getFileName().toString()));
		}

		int key = getch();
		System.out.println(key);

		getch();
		endwin();
	}
}
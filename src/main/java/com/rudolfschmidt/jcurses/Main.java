package com.rudolfschmidt.jcurses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {

		final Curses curses = Curses.loadLibrary();
		final Window win = curses.initscr();

		curses.raw();
		curses.noecho();
		curses.cbreak();
		curses.keypad(win, true);

		if (curses.has_colors()) {
			curses.start_color();
		}

		final List<Path> files = Files.list(Paths.get("/tmp")).collect(Collectors.toList());
		for (Path file : files) {
			curses.addstr(String.format("%s %n", file.getFileName()));
		}

		int count = 0;
		while (count < 10) {
			final int c = curses.getch();
			System.out.println(c);
			if (c == Key.DOWN) {
				System.out.println("ha");
			}
			count++;
		}


		curses.echo();
		curses.nocbreak();
		curses.keypad(win, false);
		curses.endwin();

	}
}

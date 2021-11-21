package pl.zimi.zadanka.naukaluznezadania.streams;

import pl.zimi.zadanka.naukaluznezadania.streams.BoardGame;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamy {
    static List<BoardGame> CreateExampleList() {
        List<BoardGame> games = Arrays.asList(
                new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
                new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
                new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5),
                new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
                new BoardGame("Scythe", 8.3, new BigDecimal("314.95"), 1, 5),
                new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
                new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2),
                new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
                new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2),
                new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4)
        );
        return games;
    }

    static void firstExample(List<BoardGame> games) {

        games.stream()
                .filter(g -> g.maxPlayers > 4)
                .filter(g -> g.rating > 8)
                .filter(g -> new BigDecimal(150).compareTo(g.price) > 0)
                .map(g -> g.name.toUpperCase())

                .forEach(System.out::println);
        games.stream()
                .map(g -> g.name.toUpperCase())
                .forEach(System.out::println);

        // metoda forEach wynika z własności obiektów typu iterable
        // nie ma nic wspólnego z interfejsem typu stream()
        games.forEach(System.out::println);
    }


    static void atomizedFirstExample(List<BoardGame> games) {
        Stream<BoardGame> gamesStream = games.stream();
        Stream<BoardGame> filteredStream = gamesStream
                .filter(g -> g.maxPlayers > 4)
                .filter(g -> g.rating > 8)
                .filter(g -> new BigDecimal(150).compareTo(g.price) > 0);
        Stream<String> namesStream = filteredStream
                .map(g -> g.name.toUpperCase());
    }

    public static void main(String[] args) {
        List<BoardGame> games = CreateExampleList();
//        firstExample(games);
        atomizedFirstExample(games);

    }
}

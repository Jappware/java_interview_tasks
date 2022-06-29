package com.jappware.celebrities;

import java.util.ArrayList;
import java.util.List;

public class Main {

  static class Celebrity {

    private final String name;
    private final List<String> followers;

    public List<String> getFollowers() {
      return followers;
    }

    Celebrity(String name, List<String> followers) {
      this.name = name;
      this.followers = followers;
    }
  }

  public static void main(String[] args) {
    // TODO: Please print all distinct followers in alphabetical order

  }

  public static Object getDistinctFollowers() {
    List<Celebrity> celebrities = new ArrayList<>(3);
    List<String> trump = new ArrayList<>();
    trump.add("Ivan");
    trump.add("Ira");

    List<String> messi = new ArrayList<>();
    messi.add("Andriy");
    messi.add("Ira");
    messi.add("Roman");

    List<String> gaga = new ArrayList<>();
    gaga.add("Kate");
    gaga.add("Olena");
    gaga.add("Roman");

    celebrities.add(new Celebrity("Donald Trump", trump));
    celebrities.add(new Celebrity("Lionel Messi", messi));
    celebrities.add(new Celebrity("Lady Gaga", gaga));

    // TODO: return all distinct followers in alphabetical order
    return null;
  }
}

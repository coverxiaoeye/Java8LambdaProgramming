package com.java.lambda;

import java.util.Iterator;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015/12/3 16:53
 * All Rights Reserved !!!
 */
public class Iteration {
    public int externalCountArtistsFromLondon(List<Artist> allArtists) {
        int count = 0;
        for (Artist artist : allArtists) {
            if (artist.isFrom("London")) {
                count++;
            }
        }
        return count;
    }

    public int externalCountArtistsFromLondonExpanded(List<Artist> allArtists) {
        int count = 0;
        Iterator<Artist> iterator = allArtists.iterator();
        while (iterator.hasNext()) {
            Artist artist = iterator.next();
            if (artist.isFrom("London")) {
                count++;
            }
        }
        return count;
    }

    public long internalCountArtistsFromLondon(List<Artist> allArtists) {
        return allArtists.stream().filter(artist -> artist.isFrom("London")).count();
    }

    public void filterArtistsFromLondon(List<Artist> allArtists) {
        allArtists.stream().filter(artist -> artist.isFrom("London"));
    }
    public void filterArtistsFromLondonPrinted(List<Artist> allArtists) {
        allArtists.stream().filter(artist -> {
            System.out.println(artist.getName());
            return artist.isFrom("London");
        });
    }

    public long internalCountArtistsFromLondonPrinted(List<Artist> allArtists) {
        return allArtists.stream().filter(artist -> {
            System.out.println(artist.getName());
            return artist.isFrom("London");
        }).count();
    }
}

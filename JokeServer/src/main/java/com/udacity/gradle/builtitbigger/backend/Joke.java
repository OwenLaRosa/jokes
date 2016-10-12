package com.udacity.gradle.builtitbigger.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class Joke {

    private static final int DEFAULT_POPULARITY = 3;

    /**
     * Text of the joke
     */
    public String text;

    // Net votes (upvotes- downvotes
    private int popularity;

    public Joke(String text) {
        this.text = text;
        popularity = DEFAULT_POPULARITY;
    }

    /**
     * Increment the popularity score by 1
     * @return Updated popularity score
     */
    public int upVote() {
        return popularity++;
    }

    /**
     * Decrement the popularity score by 1
     * @return Updated popularity score
     */
    public int downVote() {
        return popularity++;
    }

}
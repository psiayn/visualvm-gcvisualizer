/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.psiayn.test;

/**
 *
 * @author psiayn
 */
public class Pair<Left, Right> {
    
    private final Left left;
    private final Right right;

    public Pair(final Left left, final Right right) {
        this.left = left;
        this.right = right;
    }

    public Left getLeft() {
        return left;
    }

    public Right getRight() {
        return right;
    }
}

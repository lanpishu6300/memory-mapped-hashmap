/*
The MIT License (MIT)

Copyright (c) 2015 Sheridan C Rawlins

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package com.github.scr.hashmap.maps;

import com.github.scr.hashmap.DataWriter;

import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Created by scr on 7/3/15.
 */
public interface IndexedMap<K, V> extends Map<K, V>, DataWriter {
    byte getByte(K key) throws NoSuchElementException;

    char getChar(K key) throws NoSuchElementException;

    double getDouble(K key) throws NoSuchElementException;

    float getFloat(K key) throws NoSuchElementException;

    long getLong(K key) throws NoSuchElementException;

    short getShort(K key) throws NoSuchElementException;

    int getInt(K key) throws NoSuchElementException;
}
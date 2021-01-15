/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Sensor {

    private double val;
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock read = lock.readLock();
    private Lock write = lock.writeLock();

    public Sensor() {
    }

    public void write(double val) {
        write.lock();
        try {
            this.val = val;
        } finally {
            write.unlock();
        }
    }

    public double read() {
        read.lock();
        try {
            return val;
        } finally {
            read.unlock();
        }
    }
}

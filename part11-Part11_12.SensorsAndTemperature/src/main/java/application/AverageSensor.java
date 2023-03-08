/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fora
 */
public class AverageSensor implements Sensor {
    private List<Integer> readings = new ArrayList<>();
    private ArrayList<Sensor> sensors;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
    }

    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == true) {
                return true;
            }
        }
        return false;
    }

    public void setOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                sensor.setOn();
            }
        }
    }

    public void setOff() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == true) {
                sensor.setOff();
            }
        }
    }

    public int read() {
        if (this.sensors.isEmpty() || isOn() == false);
        int sum = 0;
        int count = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
            count++;
        }
        readings.add(sum / count);
        return sum / count;
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return readings;
    }
}

package org.immutability;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClass {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Paikrao",102);
        ImmutableSample immutableSample=new ImmutableSample(101,"Sarita",map);
        System.out.println(immutableSample);


    }
}

final class ImmutableSample{
    private int empId;
    private String name;
    private Map<String,Integer> sampleMap;

    ImmutableSample(int empId, String name, Map<String,Integer> sampleMap){
        this.empId=empId;
        this.name=name;

        Map<String,Integer> map=new HashMap<>();
        for (Map.Entry<String,Integer> m:sampleMap.entrySet()){
            map.put(m.getKey(),m.getValue());
        }
        this.sampleMap=map;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getSampleMap() {
        Map<String,Integer> map= new HashMap<>();
        for (Map.Entry<String,Integer> mp:this.sampleMap.entrySet()){
            map.put(mp.getKey(),mp.getValue());
        }
        return map;
    }

    @Override
    public String toString() {
        return "ImmutableSample{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", sampleMap=" + sampleMap +
                '}';
    }
}
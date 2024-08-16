package com.ryan;

import java.util.ArrayList;

/**
 * @author kq
 * 2024-08-16 14:58
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 **/
@SuppressWarnings("all")
public class HeapOOM {

    static class OOMObject {
        // 1MB
        public byte[] bytes = new byte[1024*1024];
    }

    public static void main(String[] args) {
        ArrayList<OOMObject> oomObjects = new ArrayList<>();

        while(true){
            oomObjects.add(new OOMObject());
        }
    }

}

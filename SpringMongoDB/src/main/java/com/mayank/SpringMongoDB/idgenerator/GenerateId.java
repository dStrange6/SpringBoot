package com.mayank.SpringMongoDB.idgenerator;

import java.util.UUID;

public class GenerateId
{
    public static String get()
    {
        return UUID.randomUUID().toString();
    }
}

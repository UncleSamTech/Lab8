package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static java.security.AccessController.getContext;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;




public class CustomListTest {
    @Test
    public void testAddCity() {
        CustomList customList = new CustomList(getContext(), new ArrayList<>());
        City city = new City("TestCity", "TestProvince");
        customList.addCity(city);
        assertTrue(customList.getCount() == 1);
    }
}
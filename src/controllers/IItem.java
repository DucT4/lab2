/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controllers;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface IItem<E> {

    boolean add(E Item);

    E getByCode(String bus);

    List<E> getByBus(String bus);

    List<E> getByBrand(String brand);

    List<E> getBytype(String type);

    E update(String oldId, E Item);

    E delete(String id);

   void displayAll();

    boolean save();

    boolean load();

    String genCodeType(String type);
}

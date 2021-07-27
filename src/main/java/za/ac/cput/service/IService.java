package za.ac.cput.service;
/*
    @Description:Repository ->
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 27 July 2021
*/
public interface IService<Type, ID> {
    Type create(Type t);
    Type read(ID id);
    Type update(Type t);
    boolean delete(ID id);
}

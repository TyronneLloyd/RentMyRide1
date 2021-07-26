package za.ac.cput.repository.clientAccount;
/*
    @Description: Repository for ClientAccount Entity ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 20 July 2021
 */
public interface IRepository <account, ID>
{
    account create(account t);
    account read(ID id);
    account update(account t);
    boolean delete(ID id);
}

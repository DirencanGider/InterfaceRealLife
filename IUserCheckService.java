public interface IUserCheckService { /* UserAgeCheckService ve UserComplexCheckService classlarında yer alan checkUser(User user)
                                        metodunu interface olarak yazdık. Bu classları soyutlamış olacağız. */  //  20
    boolean checkUser(User user); /* Son olarak yapmamız gereken UserAgeCheckService ve UserComplexCheckService classlarını
                                  IUserCheckService interfaceine implemente etmek.*/  //  21


}

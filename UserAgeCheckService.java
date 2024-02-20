public class UserAgeCheckService implements IUserCheckService { // IUserCheckService interfaceine implement ettik. Soyutladık. //  22

    /* Burada sadece metod olacak. Attribute olmayacak. Inheritance yerine interface ile soyutlayabiliriz. Çünkü
       özellik olmayacak sadece metod olacak. */ //  7

    public boolean checkUser(User user) {  //  8
        if(user.getAge() >=18) {
            return true;
        }
        return false;
    }

}

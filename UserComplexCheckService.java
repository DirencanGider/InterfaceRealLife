public class UserComplexCheckService implements IUserCheckService { /* UserAgeCheckServise class'ından fonksiyonu direkt
                                                                       kopyaladık ve eklemeler yaptık. */ //  16

    // IUserCheckService interfaceine implement ettik. Soyutladık. //  23

    // Bu fonksiyon birden fazla krieri kontrol edecek. //  17

    public boolean checkUser(User user) { /* "checkUser" metod ismi UserAgeCheckService ve UserComplexCheckService class'larında
                                              da aynı. Bu classların attributeları da yok. Biz bunları interfaceler ile gruplayıp
                                              soyutlayabiliriz. */ //  19
        if(user.getAge() >=18 && user.getName().startsWith("Di")) { // İsmin Di ile başlamasını kontrol edecek. //  18
            return true;
        }
        return false;
    }

}

public class SignUpManager { // Burası kullanıcıyı veritabanına kaydedermiş gibi davranacak. //  2
    private IUserCheckService iUserCheckService; /* DERSİN SON AŞAMASINDA BU CLASS IUserCheckService INTERFACE'INE BAĞIMLI
                                                    OLDUĞU İÇİN BURADA ATTRIBUTE OLARAK YAZDIK. DEPENDEANCE OLARAK.
                                                    CONSTRUCTORINI DA SAĞ CLICK ILE GENERATE DİYEREK OLUŞTURUYORUZ HEMEN ALTTA.*/  //  24

    public SignUpManager(IUserCheckService iUserCheckService) { //  25
        this.iUserCheckService = iUserCheckService;
    }

    public void signUp(User user) { // User class'ından user obje referansı bu fonksiyona gelecek. //  3

        /* UserAgeCheckService userAgeCheckService = new UserAgeCheckService(); /* UserAgeCheckService class'ı içerisindeki checkUser()
                                                                                metodunu kullanabilmek için burada obje
                                                                                 oluşturduk */ //  9

        /* Şimdi bu UserAgeCheckService için her class'ta üstteki gibi obje oluşturmamız gerekecek. Ve diyelimki bir süre sonra
        UserAgeCheckService servisini artık kullanmayacağız. Ozaman tüm oluşturduğumuz classlardan silmemiz veya da değiştirmemiz
        gerekli. Bu uzun meşakatli ve saçma bir süreç. Mantıklı bir seçenek değil.
        Diyelimki bu UserAgeCheckService dışarıdan bağladığımız bir servis ve servis 5 dakikalığına çöktü. Ozaman gidip
        heryerden bunu düzeltmemiz gerekecekti. Program da bu servise bağımlı olduğu için 5 dk çalışmayacak.
        Yarın öbürgün hem age hem de name kontrolü yapmamız gerekebilir. O zamanda daha fazla dış servise bağımlı olmuş olacağız.
        Problem çıkma olasılığı artacak ve daha fazla değişiklik yapma durumumuz da söz konusu olacak.
        Eğer bunu bir interface çatısı altında soyutlarsak böyle bir problemi ortadan kaldırmış oluruz. */ //  14

        // UserComplexCheckService şeklinde hem age hem de name kontrolü yapan bir servis yazalım. //  15

         //if(userAgeCheckService.checkUser(user)) { /* Eğer bu metod true dönerse if koşuluna gireceğiz. */ //  10
            /*System.out.println("Kullanıcı Kayıt Oldu : " + user.getName()); /* //  3   Mevcutta yer alan bu satırı 9. adımdan
                                                                                       sonra kesip if içine yapıştırdık. */ //  11

        //}
        //else { /* Eğer bu metod false kullanıcıyı kayıt etmeyecek. */ //  12
        //    System.out.println("Kullanıcı Kayıt Olamadı");
        //}

        // Şimdi Main class'ında constructor içindeki yaşı 18 altında yazarak kontrolünü yapalım. //  13

        // INTERFACE ILE SOYUTLADIKTAN SONRA TEKRAR YAZIYORUZ. // 26

        if (iUserCheckService.checkUser(user)) {
            System.out.println("Kullanıcı Kayıt Oldu : " + user.getName());

        }
        else {
            System.out.println("Kullanıcı Kayıt Olamadı");

        }


    }

}

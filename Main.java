public class Main {

    public static void main(String[] args) {

        SignUpManager signUpManager = new SignUpManager(new UserComplexCheckService()); // SignUpManager içinde objemizi oluşturduk. //  4

        /*  EN EN SON OLARAK ARTIK İSTEDİĞİMİZ SERVİSİ KULLANABİLİRİZ. ÜSTTE SignUpManager içerisine artık UserAgeCheckService
            VEYA UserComplexCheckService GÖNDEREBİLİRİZ. */ //  27

        signUpManager.signUp(new User(1,"Direncan",18)); // Yeni kullanıcımızı oluşturduk. //  5

        /* Bu aşamada bir iş gereksinimimiz ortaya çıktı. Sisteme yaş kaydetmek istiyoruz fakat 18+ olacak şekilde.
           bunun için kullanıcıyı kontrol edecek bir servis yazmamız gerekmekte.
           Eğer kullanıcı 18 yaşındaysa veya büyükse true değer döndürecek sisteme kayıt edecek, değilse false değer
           döndürerek kayıt etmeyecek. Bunun için proje içerisinden AgeUserCheckService adında bir class oluşturuyoruz. */ //  6

    }

}

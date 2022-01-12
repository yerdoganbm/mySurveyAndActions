package com.example.sealedtest;


/*
JDK-17 ye JEP-409 ile geldi.
İzin verilen her sub-class, üst sınıfı extend etmelidir.
alt sınıflar erişim belirteci olarak sealed, non-selaed ve final kullanmalıdır. Çünkü 1. kademe extend için bu gereklidir. 2. Kademe extend
işlemi(1. kademedeki class extend edilmek edeilirse) erişim belirteçleri kullanılmadan buna izin verilmemektedir.

sealed : Extend edebilecek alt sınıflar belirleniyor. Ve bu erişim belirteci kullanıldığında alt sınıfların hepsi üst sınıfı extend
etmek zorundadır.

Non-sealed : Mühürsüz, tüm classlar extend edebilir.

final : Sealed olarak belirtilen üst sınıf için; izin verilen alt sınıf final ise bu alt sınıfı başka bir alt sınıf extend edemez.

 */

public abstract sealed class ExtendClass permits FirstStepExtendOneClass, FirstStepExtendTwoClass {
    protected final String registrationNumber;

    public ExtendClass(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }


}







# Algoritmalar ve Karmaşıklık 🚀

![Proje Banner'ı](https://github.com/yunuseemredogan/screenshots-.gitkeep/blob/main/algorithms-complexity.png)

## 📖 Genel Bakış
Bu GitHub deposu, **Algoritmalar ve Karmaşıklık** dersi kapsamında hazırladığım ödevleri ve ilgili projeleri içermektedir. Depo, algoritma tasarımı, veri yapıları ve hesaplama karmaşıklığı konularında pratik uygulamalar sunar. Her ödev, belirli bir algoritmik problemi çözmek veya veri yapısını uygulamak için geliştirilmiş olup, genellikle Java programlama dili kullanılarak yazılmıştır.

Bu depo, aşağıdaki amaçlar için faydalıdır:
- Algoritma ve veri yapısı kavramlarını öğrenmek ve uygulamak.
- Matris işlemleri, envanter yönetimi, dosya işleme ve hash tablosu gibi farklı problem türlerini anlamak.
- Zaman ve uzay karmaşıklığı analizini gerçek dünya örnekleriyle görmek.

Depodaki projeler, genellikle belirli bir problemi çözmek için tasarlanmış küçük ölçekli uygulamalar içerir. Kodlar, açık ve anlaşılır bir şekilde yazılmış olup, her biri yorumlarla desteklenmiştir. Ödevler, temel algoritma tekniklerinden (örneğin, döngüler ve koşullu ifadeler) daha karmaşık veri yapılarına (örneğin, hash tabloları) kadar geniş bir yelpazeyi kapsar.

## ✨ Temel Özellikler
- **Matris İşlemleri**: Matris oluşturma, rastgele değer atama, asal sayı işaretleme ve matris çarpımı gibi işlemler (örn. `cMatrix.java`).
- **Envanter Yönetimi**: Elektronik bileşenlerin envanterini yönetme, sıralama ve silme işlemleri (örn. `Yunus_Emre_Dogan_HW2.java`).
- **Dosya İşleme**: Metin dosyalarından veri okuma, şekil bulma ve sonuçları dosyaya yazma (örn. `Yunus_Emre_Dogan_HW3.java`).
- **Hash Tablosu Uygulaması**: Anahtar-değer çiftleri ile hash tablosu oluşturma, ekleme, silme ve arama işlemleri (örn. `Yunus_Emre_Dogan_HW4.java`).
- **Zaman Karmaşıklığı Analizi**: Matris çarpımı gibi işlemler için işlem sayısı ve süre ölçümü.
- **Hata Yönetimi**: Try-catch bloklarıyla sağlam hata kontrolü ve kullanıcı dostu hata mesajları.

## 📋 Gereksinimler
Bu projeleri çalıştırmak için aşağıdaki gereksinimlere ihtiyacınız var:

### Yazılım Gereksinimleri:
- **Java 8+**: Kodlar Java ile yazılmıştır. [oracle.com](https://www.oracle.com/java/technologies/javase-downloads.html) adresinden indirilebilir.
- **IDE veya Derleyici**: NetBeans, IntelliJ IDEA veya Eclipse gibi bir Java geliştirme ortamı önerilir. Alternatif olarak, terminal üzerinden `javac` ve `java` komutları kullanılabilir.
- **Git**: Depoyu klonlamak için (isteğe bağlı).

### Donanım Gereksinimleri:
- Herhangi bir modern bilgisayar (Windows, Linux veya macOS).
- Dosya işleme ödevleri için yerel dosya sistemine erişim (örn. `HW3Q2.txt` gibi dosyalar).

## 🛠️ Kurulum
Projeleri yerel makinenizde çalıştırmak için aşağıdaki adımları izleyin:

1. **Depoyu Klonlayın**:
   ```bash
   git clone https://github.com/yunuseemredogan/Algorithms-and-Complexity.git
   cd Algorithms-and-Complexity
   ```

2. **Java Ortamını Kurun**:
   - Java'nın yüklü olduğundan emin olun: `java -version` komutunu çalıştırın.
   - Gerekirse JDK'yı indirin ve PATH ortam değişkenine ekleyin.

3. **Projeleri Derleyin ve Çalıştırın**:
   - Bir IDE kullanıyorsanız, projeyi içe aktarın ve `main` metodunu çalıştırın.
   - Terminal kullanıyorsanız, örneğin `cMatrix.java` için:
     ```bash
     javac cMatrix/cMatrix.java
     java cMatrix.cMatrix
     ```

4. **Dosya İşleme için Hazırlık**:
   - `Yunus_Emre_Dogan_HW3.java` gibi dosya işlemleri yapan ödevler için, gerekli giriş dosyalarının (örn. `HW3Q2.txt`) doğru dizinde olduğundan emin olun.

## ▶️ Kullanım
Her ödev, bağımsız bir Java programı olarak çalışır. Aşağıda ödevlerin kısa bir özeti ve nasıl çalıştırılacağı açıklanmıştır:

1. **cMatrix.java**:
   - 10x10 varsayılan matris veya kullanıcı tanımlı boyutlarda matris oluşturur.
   - Rastgele sayılar atar, asal sayıları işaretler ve matris çarpımı yapar.
   - Çalıştırmak için: `java cMatrix.cMatrix`.

2. **Yunus_Emre_Dogan_HW2.java**:
   - Elektronik bileşen envanterini yönetir (rezistör, transistör, kapasitör, indüktör).
   - İsim veya sayıya göre sıralama yapar ve silme işlemleri gerçekleştirir.
   - Çalıştırmak için: `java com.mycompany.yunus_emre_dogan_hw2.Yunus_Emre_Dogan_HW2`.

3. **Yunus_Emre_Dogan_HW3.java**:
   - Bir metin dosyasından şekil verilerini okur, şekilleri bulur ve sonuçları ekrana ve dosyaya yazar.
   - Çalıştırmak için: Giriş dosyasını doğru dizine yerleştirin ve `java com.mycompany.yunus_emre_dogan_hw3.Yunus_Emre_Dogan_HW3` komutunu çalıştırın.

4. **Yunus_Emre_Dogan_HW4.java**:
   - Hash tablosu oluşturur, anahtar-değer çiftleri ekler, siler ve arar.
   - Çalıştırmak için: `java com.mycompany.yunus_emre_dogan_hw4.Yunus_Emre_Dogan_HW4`.

## 🔍 Nasıl Çalışır?
Depodaki her ödev, belirli bir algoritmik veya veri yapısı problemini çözmek için tasarlanmıştır:
- **cMatrix.java**: Matris işlemleri için döngüler ve koşullu ifadeler kullanır. Matris çarpımı O(n³) karmaşıklığına sahiptir ve asal sayı kontrolü için basit bir algoritma uygular.
- **Yunus_Emre_Dogan_HW2.java**: Nesne yönelimli programlama ile envanter yönetimi yapar. Sıralama işlemleri için karşılaştırma tabanlı algoritmalar kullanılır.
- **Yunus_Emre_Dogan_HW3.java**: Dosya I/O ve string işleme teknikleri ile şekil tanıma problemini çözer.
- **Yunus_Emre_Dogan_HW4.java**: Hash tablosu veri yapısını uygular, çarpışma yönetimi için basit bir yaklaşım kullanır.

## 🧱 Kod Yapısı
- Her dosya, bağımsız bir Java sınıfı içerir.
- Paket yapısı, ödevin adına veya konusuna göre düzenlenmiştir (örn. `cMatrix`, `com.mycompany.yunus_emre_dogan_hw2`).
- Kodlar, okunabilirlik için yorumlarla desteklenmiştir.
- Hata yönetimi, try-catch bloklarıyla sağlanmıştır.

## ⚠️ Sorun Giderme
- **Java Sürüm Hatası**: Doğru Java sürümünü kullandığınızdan emin olun (`java -version`).
- **Dosya Bulunamadı**: `HW3Q2.txt` gibi giriş dosyalarının doğru dizinde olduğundan emin olun.
- **Derleme Hataları**: Paket adlarının ve dosya yollarının doğru olduğundan emin olun.
- **Performans Sorunları**: Büyük matrisler için `cMatrix.java` çalıştırırken bellek kullanımına dikkat edin.

## 📉 Sınırlamalar
- Ödevler genellikle belirli bir problem için özelleşmiştir ve genelleştirilmiş çözümler sunmaz.
- Dosya işleme ödevleri, belirli dosya yollarına bağımlıdır (örn. Windows yolları).
- Matris boyutları 10,000x10,000 ile sınırlıdır.

## 🤝 Katkıda Bulunma
Depoyu fork edebilir, değişiklikler yapabilir ve pull request gönderebilirsiniz! Öneriler: Daha verimli algoritmalar ekleme, hata işleme iyileştirmeleri veya ek test senaryoları.

## 📜 Lisans
MIT Lisansı - Kodları kullanabilir, değiştirebilir ve paylaşabilirsiniz. [LICENSE](LICENSE) dosyasına bakın.

*2025'te ❤️ ile oluşturuldu. Sorular veya geri bildirim için bir issue açın!*

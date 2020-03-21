package com.fauzan264.westjavafoods.model;

import com.fauzan264.westjavafoods.R;

import java.util.ArrayList;

public class FoodsData {

    private static String[] foodNames = {
            "Asinan Bogor",
            "Dodongkal",
            "Empal Gentong",
            "Galendo",
            "Lepet Kuningan",
            "Nasi Uduk Ungu",
            "Soto Bongko",
            "Soto Kuning",
            "Tahu Sumedang",
            "Ubi Cilembu"
    };

    private static String[] foodCity = {
            "Bogor",
            "Bogor",
            "Cirebon",
            "Ciamis",
            "Kuningan",
            "Sukabumi",
            "Sumedang",
            "Bogor",
            "Sumedang",
            "Sumedang"
    };

    private static String[] foodDetails = {
            "Kalau orang Eropa punya salad sebagai menu hidangan penutup, Indonesia juga punya. Namanya asinan. Asinan merupakan kuliner tradisional berisi sayuran dan buah yang dicampur dengan kuah pedas. Secara umum, terdapat dua jenis asinan, yaitu asinan Betawi dan asinan Bogor. Perbedaan antara keduanya hanya terletak pada kuah dan penambahan bahan campurannya. Jika asinan Betawi menggunakan kuah bumbu kacang, asinan Bogor menggunakan kuah yang diambil dari saripati cabai merah.",
            "Ada satu lagi kuliner yang bisa dinikmati di kota Bogor. Namanya dodongkal. Dodongkal adalah kue tradisional yang termasuk ke dalam jajanan pasar. Dodongkal terbuat dari bahan-bahan yang hampir sama dengan kue putu, yaitu tepung beras, gula aren, dan parutan kelapa. Meskipun rasanya hampir sama dengan kue putu, dodongkal lebih padat. Selain itu tampilan dodongkal berbeda dengan kue putu. Bila dalam kue putu, gula aren terdapat di dalam kue, dalam dodongkal gula aren disusun selang-seling dengan tepung beras. Lapisannya dibuat tidak beraturan.\n\n" + "Dodongkal berbentuk tumpeng yang sudah dipotong-potong ditaruh di dalam etalase. Tepung beras untuk dodongkal tak pernah diberi pewarna. Jadi dodongkalitu selalu berwarna putih selang-seling dengan warna cokelat dari gula aren.\n\n" + "Satu hal yang membuat dodongkal istimewa adalah kelapa parut yang ditaburkan berasal dari kelapa yang masih muda dan diparut kasar. Itu membuat rasa dodongkal jadi lebih gurih.",
            "Empal gentong adalah salah satu makanan khas asal Cirebon. Makanan ini sebenarnya mirip dengan soto. Cara makannya pun tak jauh beda dengan soto yaitu dimakan dengan lontong atau nasi. Yang membedakan makanan ini adalah dari cara masaknya yang khas yaitu menggunakan gentong sebagai media memasaknya. Dan lagi, makanan ini dimasak hanya dengan menggunakan kayu bakar sebagai bahan bakarnya.\n\n" + "Selain media memasaknya yang khas, empal gentong pun memiliki sambal yng punya citarasa yang tak kalah khasnya. Sambal yang super pedas dan berbahan dasar sari pati cabe rawit yang sudah dikeringkan ini membuat rasa maupun aromanya benar-benar khas dan menggugah selera.",
            "Jika berkunjung ke kota Ciamis di Jawa Barat jangan lupa bertanya dan membawa oleh-oleh makanan khas Ciamis yaitu galendo (gelendo). Makanan yang dibuat dari ampas pembuatan minyak kelapa ini sangat nikmat jika dinikmati secangkir teh panas atau kopi pahit, tersedia jika dicocolkan ke dalam gula putih.",
            "Bewarna kecoklatan dibalut dengan daun kelapa yang telah ditipiskan menjadi salah satu ciri khas dan pembeda lepet Kuningan dengan lepet kebanyakan. Jika biasanya lepet bewarna kuning cerah, tidak untuk lepet yang menjadi panganan khas kota yang diatur di bawah kaki Gunung Ceremai ini. \n\n" + "Lepet merupakan kudapan yang dibuat dari ketan yang mengandung kelapa dan menggunakan kacang tunggak sebagai isinya kemudian dibungkus dengan daun kelapa sebelum direbus. Soal rasa lepet Kuningan tidak berbeda dengan lepet terbesar. Rasanya yang sedikit asin dan gurih jadi dominan kompilasi lidah Anda buat panganan yang satu ini. \n\n" + "Selain nikmat, ternyata Lepet juga sangat bermanfaat bagi kesehatan tubuh. Salah satunya untuk mengurangi batuk dan menghilangkan uap yang terakumulasi dalam paru-paru. Karena lepet menggunakan ketan putih sebagai bahan dasar.",
            "Meski hanya nasi uduk, namun ada yang istimewa dari nasi uduk yang ada di Sukabumi ini. Warnanya tidak putih layaknya nasi uduk yang ada di benak kita. Namun ungu. Ya, nasi uduk ungu.\n\n" + "Jika penasaran mengapa bisa berwarna ungu, datang saja ke Mamih Ungu Resto di Sukabumi. Nasi uduknya disajikan dengan ayam goreng kemiri, tahu, tempe, lalap+sambal serta telor dadar tipis sebagai alasnya. Menu andalan ini diberi nama Nasi Uduk Ungu Spesial.\n\n" + "Dari mana warna ungu untuk nasi itu didapat? Sang empunya bilang bahwa warna tersebut berasal dari buah bit dan ubi, rasanya tidak kentara pada nasi uduk yang sudah gurih itu, tapi kandungan gizi yang terdapat pada umbi-umbian itu menjadi nilai tambah tersendiri untuk sajian ini.",
            "Kabupaten Sumedang, Jawa Barat, memiliki kuliner yang khas selain Tahu Sumedang, yakni Soto Bongko. \n\n" + "Soto Bongko terdiri dari potongan lontong yang disajikan bersama toge rebus, potongan tahu Sumedang, bawang goreng, lalu disiram kuah kari kental dan diberi kecap manis. Lontong tersebut biasanya dicetak menggunakan daun pisang atau plastik. Soto Bongko akan lebih nikmat untuk dilahap jika disajikan hangat dengan kerupuk atau emping dan sambal sebaga pelengkap.\n\n" + "Rasa gurih yang dominan dari kuah kari serta tahu Sumedang yang telah digoreng sebelumnya.",
            "Siapa tak kenal salah satu makanan khas bogor ini, soto kuning sudah cukup identik dengan kota Bogor. Jadi cukup banyak penjual soto kuning di daerah Bogor ini. Dan yang sudah sering jadi rekomendasi penjual soto kuning enak di Bogor berjualan di Jalan Surya Kencana Bogor.\n\n" + "Soto kuning ini memang kuahnya menggunakan santan, jadi pasti gurih dan lezat, dan biasa menggunakan rendaman daging sapi supaya lebih berkaldu.\n\n" + "Dan kalau kita mau pesan, kita bisa memilih sendiri, jadi sudah di display potongan-potongan daging dan jeroan.",
            "Tahu merupakan makanan yang mengandung banyak protein nabati karena terbuat dari kacang kedelai. Makanan yang relatif murah tetapi sangat bergizi sehingga cocok menjadi santapan pecinta kuliner dari berbagai usia, apalagi untuk anak-anak yang masih dalam masa pertumbuhan. Tahu bisa diolah dengan berbagai cara, seperti dibacem, dipepes, ataupun digoreng. Khusus untuk tahu yang digoreng, salah satu yang paling terkenal adalah Tahu Sumedang, yang merupakan makanan khas dari Kabupaten Sumedang, Jawa Barat.",
            "Mungkin sudah banyak diantara kita yang tidak asing lagi mendengar nama makanan 'Ubi Cilembu'. Saat kita bepergian ke berbagai daerah wisata di Jawa Barat dan sekitarnya, kerap kali ditemukan toko-toko atau usaha masyarakat sekitar yang menawarkan Ubi Cilembu. Tapi, tahukah kamu darimana asal Ubi Cilembu itu sebenarnya? Ubi Cilembu berasal dari Desa Cilembu di Kabupaten Sumedang, Jawa Barat. Ubi Cilembu sebetulnya berasal dari hasil budidaya tanaman ubi jalar yang ditanam dengan pola tanam yang berbeda dengan ubi lainnya. Dan uniknya, apabila kita menanam ubi cilembu di daerah luar Desa Cilembu, maka ubi yang dihasilkan akan berbeda baik dari segi aroma, rasa, dan hal lainnya, sehingga ubi cilembu sesuatu keunikan dan ciri khas yang dapat dijadikan sebagai komoditas utama dari Desa Cilembu, Kabupaten Sumedang itu sendiri."
    };

    private static int[] foodImages = {
            R.drawable.asinanbogor,
            R.drawable.dodongkal,
            R.drawable.empalgentong,
            R.drawable.galendo,
            R.drawable.lepetkuningan,
            R.drawable.nasiudukungu,
            R.drawable.sotobongko,
            R.drawable.sotokuning,
            R.drawable.tahusumedang,
            R.drawable.ubicilembu
    };

    public static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setCity(foodCity[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodImages[position]);
            list.add(food);
        }
        return list;
    }
}

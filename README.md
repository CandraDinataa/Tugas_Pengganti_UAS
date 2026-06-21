# 🧮 Calculator CI/CD - Java Maven

Project kalkulator Java dengan pipeline CI/CD lengkap menggunakan GitHub Actions.

## 📋 Komponen CI/CD

| Komponen | Tool | Deskripsi |
|---|---|---|
| **Continuous Integration** | Maven Compile | Build dan kompilasi project |
| **Continuous Testing** | JUnit 5 + Surefire | 25+ unit test otomatis |
| **Continuous Inspection** | Checkstyle + JaCoCo | Code style & coverage ≥80% |
| **Continuous Delivery** | GitHub Release | Publish JAR artifact |

## 🚀 Cara Menjalankan Lokal

```bash
# Clone repository
git clone https://github.com/<username>/calculator-cicd.git
cd calculator-cicd

# Build project
mvn compile

# Jalankan test
mvn test

# Jalankan dengan coverage check
mvn verify

# Build JAR
mvn package -DskipTests

# Jalankan JAR
java -jar target/calculator-1.0.0.jar
```

## 🔄 Alur Pipeline CI/CD

```
Push / Pull Request
        │
        ▼
┌─────────────────────┐
│  CI: Build & Compile │
└──────────┬──────────┘
           │ ✅
           ▼
┌─────────────────────┐
│  CT: Unit Testing   │
│  (JUnit 5, 25 test) │
└──────────┬──────────┘
           │ ✅
           ▼
┌─────────────────────┐
│  CI: Code Inspection │
│  Checkstyle + JaCoCo│
└──────────┬──────────┘
           │ ✅ (hanya branch main)
           ▼
┌─────────────────────┐
│  CD: Deploy Release  │
│  (GitHub Release)   │
└─────────────────────┘
```

## 🧪 Daftar Unit Test

- **Penjumlahan**: positif, negatif, nol, desimal
- **Pengurangan**: positif, hasil negatif, nol
- **Perkalian**: positif, nol, negatif
- **Pembagian**: positif, desimal, pembagian nol (exception)
- **Pangkat**: eksponen positif, nol, satu, negatif
- **Akar Kuadrat**: positif, nol, negatif (exception), desimal
- **Modulo**: positif, hasil nol, modulo nol (exception)

## 📊 Standar Kualitas

- **Code Coverage**: minimum 80% (divalidasi JaCoCo)
- **Code Style**: Google Java Style (divalidasi Checkstyle)
- **Java Version**: JDK 11

## 👥 Anggota Kelompok

| Nama | NIM | Komponen |
|---|---|---|
| [Nama 1] | [NIM] | Continuous Integration |
| [Nama 2] | [NIM] | Continuous Testing |
| [Nama 3] | [NIM] | Continuous Inspection |
| [Nama 4] | [NIM] | Continuous Delivery |

# تطبيق إدارة القضايا القانونية 📋

تطبيق Android متقدم لإدارة القضايا القانونية وتنظيم الجلسات والتواريخ المهمة.

## المميزات ✨

- ✅ إضافة وتعديل وحذف القضايا
- ✅ تتبع حالة القضايا (مفتوحة، مغلقة، معلقة)
- ✅ تقويم للجلسات والتواريخ المهمة
- ✅ البحث عن القضايا
- ✅ حفظ البيانات محلياً باستخدام Room Database
- ✅ واجهة مستخدم سهلة وبديهية
- ✅ دعم اللغة العربية

## التقنيات المستخدمة 🛠️

- **Language**: Kotlin
- **Architecture**: MVVM (Model-View-ViewModel)
- **Database**: Room Database
- **Navigation**: Android Navigation Component
- **UI Framework**: Material Design 3
- **Async**: Kotlin Coroutines
- **Lifecycle**: AndroidX Lifecycle

## متطلبات المشروع 📦

- Android SDK 26 أو أحدث
- Android Studio 4.2 أو أحدث
- Gradle 8.0 أو أحدث

## خطوات التثبيت والبناء 🚀

### 1. استنساخ المستودع
```bash
git clone https://github.com/mohamed1181/lawyer-case-app3.git
cd lawyer-case-app3
```

### 2. فتح المشروع في Android Studio
```bash
# انسخ المجلد إلى Android Studio أو افتحه مباشرة
```

### 3. تثبيت المتطلبات
```bash
# سيتم تحميل جميع المتطلبات تلقائياً عند فتح المشروع
```

### 4. بناء التطبيق
```bash
./gradlew build
```

### 5. تشغيل التطبيق
```bash
# على جهاز محاكى أو هاتف حقيقي
./gradlew installDebug
```

## بناء APK للإنتاج 📱

```bash
# بناء Release APK
./gradlew assembleRelease

# سيكون APK موجوداً في:
# app/build/outputs/apk/release/app-release.apk

# بناء Release Bundle (للـ Google Play)
./gradlew bundleRelease

# السير يكون موجوداً في:
# app/build/outputs/bundle/release/app-release.aab
```

## هيكل المشروع 📂

```
lawyer-case-app3/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── kotlin/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── database/
│   │   │   │   │   ├── AppDatabase.kt
│   │   │   │   │   ├── CaseEntity.kt
│   │   │   │   │   └── CaseDao.kt
│   │   │   │   ├── repository/
│   │   │   │   │   └── CaseRepository.kt
│   │   │   │   └── viewmodel/
│   │   │   │       └── CaseViewModel.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   ├── menu/
│   │   │   │   └── values/
│   │   │   └── AndroidManifest.xml
│   │   ├── test/
│   │   └── androidTest/
│   └── build.gradle
├── settings.gradle
└── README.md
```

## الخطوات التالية 🎯

1. **إنشاء Fragments**:
   - CasesFragment (عرض جميع القضايا)
   - CaseDetailFragment (تفاصيل القضية)
   - AddCaseFragment (إضافة قضية جديدة)
   - CalendarFragment (التقويم)
   - ProfileFragment (الملف الشخصي)

2. **إضافة Adapters**:
   - CasesAdapter (لعرض قائمة القضايا)

3. **إضافة Navigation Graph**

4. **إضافة وحدات اختبار**

5. **نشر على Google Play Store**

## المساهمة 🤝

نرحب بالمساهمات! يرجى:
1. Fork المستودع
2. إنشاء فرع للميزة الجديدة
3. Commit التغييرات
4. Push إلى الفرع
5. فتح Pull Request

## الترخيص 📄

هذا المشروع مرخص تحت MIT License - انظر LICENSE file للتفاصيل.

## الدعم والتواصل 📞

في حالة أي مشاكل أو استفسارات:
- افتح Issue على GitHub
- تواصل معنا عبر البريد الإلكتروني

---

**تم الإنشاء بواسطة**: محمد
**التاريخ**: 2026

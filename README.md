# adata-connector-public-dto

Public DTO library for **Adata Connector Service** integration.

Provides all Request/Response payload classes needed to integrate with the Adata Connector REST API.

## Installation via JitPack

### Maven
Add JitPack repository to your `pom.xml`:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Add the dependency:
```xml
<dependency>
    <groupId>com.github.YOUR_GITHUB_ORG</groupId>
    <artifactId>adata-connector-public-dto</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
    implementation 'com.github.YOUR_GITHUB_ORG:adata-connector-public-dto:1.0.0'
}
```

## Package Structure

```
kz.jysan.business.gov.connector.adata.dto
├── Search*RequestPayload      — входящие запросы
├── Search*ResponsePayload     — исходящие ответы  
├── common/                    — общие DTO (CompanyDataBasic, CourtCase, RehabilitationInfo, ...)
├── company/                   — DTO для юридических лиц
├── entrepreneur/              — DTO для ИП (v1)
├── entrepreneur/v2/           — DTO для ИП (v2)
├── individual/                — DTO для физических лиц
└── v2/                        — v2 response payloads
```

## Key DTOs

| Class | Description |
|---|---|
| `SearchCompanyRequestPayload` | Запрос поиска юр. лица |
| `SearchCompanyResponsePayload` | Ответ с данными юр. лица |
| `SearchEntrepreneurRequestPayload` | Запрос поиска ИП |
| `SearchEntrepreneurResponsePayload` | Ответ с данными ИП |
| `SearchIndividualRequestPayload` | Запрос поиска физ. лица |
| `SearchIndividualResponsePayload` | Ответ с данными физ. лица |
| `CourtCase` | Судебное дело с историей и документами |
| `RehabilitationInfo` | Данные реабилитации и банкротства |
| `TrustworthyExtended` | Расширенные признаки благонадежности |
| `KzCoTrustworthyPlus` | Расширенные признаки благонадежности+ |

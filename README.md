# 경남녹색환경지원센터 (GNGEC)

<!-- <img src="https://img.shields.io/badge/[기술명]-[배경색]?style=[모양]&logo=[아이콘명]&logoColor=[글자색]"/> -->
<!-- <img src="https://img.shields.io/badge/[기술명]-[라벨]-[색상]"/> -->
<img src="https://img.shields.io/badge/java-v17-blue?logo=openjdk&style=flat"/>

<img src="https://img.shields.io/badge/javascript-ES6+-F7DF1E?logo=javascript&style=flat"/>
<img src="https://img.shields.io/badge/thymeleaf-v3.1.2-005F0F?logo=thymeleaf&style=flat"/>
<img src="https://img.shields.io/badge/gradle-v8.2-02303A?logo=gradle&style=flat"/>
<img src="https://img.shields.io/badge/springboot-v3.2.4-6DB33F?logo=springboot&style=flat"/>

## 프로젝트 소개
### 경남녹색환경지원센터 홈페이지 개발을 위한 프로젝트이다.
#### 관리용 사이트와 사용자 사이트로 나누어 구성되어 있다.
#### 싱글 모듈로 구성

## Contents
- [기본환경정보](#기본환경정보)
- [프로젝트 구조](#프로젝트-구조)

## 기본환경정보
프로젝트에서 사용된 환경 프로그램 정보는 다음과 같다.

| 프로그램명         |  버전 명 |
|:--------------|:-----:|
| SpringBoot    | 3.2.4 |
| java          |   17  |
| Gradle        |  8.2  |
| DB            | MYSQL |

## 프로젝트 구조
- 대괄호([ ])로 묶여 있는 항목은 업무 키워드 명칭임으로 변경될 수 있는 값임을 참고할 것
<!-- cli tree 사용 -->
```bash
.
src
├─main
│  ├─java                                     # kotlin 일 경우 상위 폴더명만 다름. 그 외 동일
│  │  └─io
│  │      └─tgsinc
│  │          └─tsggngec
│  │              ├─[domain]                  # Business 도메인 Layer
│  │              │   ├─admin                 # 관리자 영역
│  │              │   │  ├─controller         # controller
│  │              │   │  ├─service            # service
│  │              │   │  ├─dto                # dto
│  │              │   │  ├─entity             # entity
│  │              │   │  └─repository         # Repository
│  │              │   └─user                  # 유저 영역
│  │              │      ├─controller         # controller
│  │              │      ├─service            # service
│  │              │      ├─dto                # dto
│  │              │      ├─entity             # entity
│  │              │      └─repository         # Repository
│  │              │     
│  │              └─[global]                  # 공통 설정
│  │                  ├─auth                  # 인가, 인증             
│  │                  ├─common                # 공통클래스 
│  │                  ├─config                # 각종 config
│  │                  ├─error                 # error 영역
│  │                  └─util                  # 공통 util성 클래스
│  │          
│  └─resources
│      ├─messages                             # Message
│      ├─sql                                  # 초기에 실행할 sql 값
│      ├─static               
│      │  └─assets                            # 정적 리로스                           
│      └─templates                            # Thymeleaf 파일
│         ├─[common]                          # View 대분류 구분
│         │   └─[login]                       # View 기능 구분
│         └─layout                            # Thymeleaf Layout 구성
```

## 설정파일

| 파일                    | 경로                                       | 역할                                                  |
|:----------------------|:-----------------------------------------|:----------------------------------------------------|
| [application.yml]     | ./src/main/resources/application.yml     | 메인 설정 파일이며 공통 설정을 등록                                |
| [application-pro.yml] | ./src/main/resources/application-pro.yml | 운영서버 설정 파일이며 운영서버 정보 및 설정을 등록                       |
| [application-dev.yml] | ./src/main/resources/application-dev.yml | 개발서버 설정 파일이며 개발서버 정보 및 설정을 등록                       |
| [application-tgs.yml] | ./src/main/resources/application-tgs.yml | 사내 개발서버 설정 파일이며 프로젝트 build 시 자동 삭제, 각자의 로컬 환경 세팅/개발 |

[application.yml]: /common/src/main/resources/application.yml
[application-pro.yml]: /common/src/main/resources/application-pro.yml
[application-dev.yml]: /common/src/main/resources/application-dev.yml
[application-tgs.yml]: /common/src/main/resources/application-tgs.yml

### 주요설정
- spring.profiles.active: 사용할 property 지정
- spring.datasource: 프로젝트에 사용되는 Database 정보

## 구동
### CLI 구동방법
-- TODO 내용 수정 필요 --

gradle build : `./gradlew bootJar` 하고, `java -jar application-0.0.1-yyyyMMdd.jar` 명령어로 구동한다.
```bash
# jar build
# Build
./gradlew bootJar
# 구동
java -jar application-0.0.1-yyyyMMdd.jar

# war build
# Build
./gradlew bootWar
# 구동
java -jar application-0.0.1-yyyyMMdd.war
```

### IDE 구동
- [@SpringBootApplication]: 파일 우클릭
- [@SpringBootApplication-by-Homepage]: 파일 우클릭
- Run XXXApplication 선택

[@SpringBootApplication]: app-manage/src/main/kotlin/io/tgsinc/gngec/ManageApplication.kt
[@SpringBootApplication-by-Homepage]: app-homepage/src/main/kotlin/io/tgsinc/gngec/HomepageApplication.kt

### 구동 후 확인
- 구동 후 API 테스팅 툴 또는 curl을 이용하여 `http://localhost:포트번호` 로 확인 가능하다.  
- 관리자 초기 포트번호는 8080이며 `src/resources/application.yml` 파일의 `server.port` 항목에서 변경 가능하다.
- 홈페이지 초기 포트번호는 9090이며 `src/resources/application.yml` 파일의 `server.port` 항목에서 변경 가능하다.

## 참고사항
- 멀티 모듈로 구성된 프로젝트이며, 관련 설정 변경은 [build.gradle] 파일 내에서 진행한다.

- 관리자 페이지와 홈페이지 페이지는 별도로 구동한다.
  - app-manage: 관리자 페이지
  - app-homepage: 홈페이지 


[build.gradle]: ./build.gradle

## 기타
- 특이사항 없음

## 연관 프로젝트

## 변경사항
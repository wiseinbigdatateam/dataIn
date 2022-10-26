# datain
## springboot - vue.js
- Mac OS 환경을 기본으로 설명
- IDE(개발도구)로서는 인텔리제이를 사용
- vuefront 디렉토리 = frontend 부분

### 실행전 필요 요소
- vue 사용을 위해 node.js 설치가 필요
    - https://nodejs.org/ko/
    - 위의 링크에서 사용중인 OS환경에 맞는 node.js LTS 버전을 받아서 설치해준다. - 간편 설치
    - 혹은 맥의 경우 brew 를 이용한 nvm 설치도 가능하다.
    ```
    $ brew update
    $ brew install nvm
  ```
    nvm 설치가 완료되면 nvm 환경변수를 설정 해주자
    ```
  $ vim ~/.zshenv
  ```
  아래의 내용을 추가 해주자
    ```
    export NVM_DIR="$HOME/.nvm"
    [ -s "/opt/homebrew/opt/nvm/nvm.sh" ] && \. "/opt/homebrew/opt/nvm/nvm.sh"  # This loads nvm
    [ -s "/opt/homebrew/opt/nvm/etc/bash_completion.d/nvm" ] && \. "/opt/homebrew/opt/nvm/etc/bash_completion.d/nvm"  # This loads nvm bash_completion
  ```
  여기까지 완료되었다면 nvm 설치 확인을 위해 버전을 찍어보자
    ```
   $ nvm -v
    ```
  nvm 이용한 node.js 설치를 위해 사용 가능한 버전을 확인해보자
  ````
  $ nvm ls -remote
  ````
  이후 원하는 버전을 선택하여 설치
  ```
  $ nvm install [버전]
  ```
------------
- vue3.x 버전사용을 위한 vue@cli 설치가 필요
  - vue/cli 를 전역으로 설치
  ```
  $ npm install -g @vue/cli
  ```
------------
### 실행 시
#### 이후 해당 프로젝트를 열거나 다시 gradle 을 사용해 다시 빌드 해주어여야한다.
  - 인텔리제이를 기준으로 상단 메뉴의 view -> Tool Windows -> gradle 이나 우축의 Gradle을 클릭 해당 메뉴에서 좌측 상단의 새로고침을 클릭시에 build.gradle의 변경 사항을 적용 해준다.
  - build.gradle 재실행시에 node 및 npm이 해당 파일에 명시된 버전으로 다시 다운로드 되고 빌드가 진행 됨.
    - node 14.x 버전 이하에서 m1 맥에서 정상 작동하지 않음
------------
#### vue.js 정상 작동을 먼저 확인
  - vuefornt로 접근, vue 서버를 실행시켜서 정상적으로 페이지가 출력되는지 확인
    ```
    $ cd vuefront
    $ npm run serve
  - 정상 작동 한다면 종료
------------
#### Port 정보
  - vue.js 의 경우 현재 기본 port 인 3000 를 사용 중
  - springboot 의 경우 마찬가지로 기본 port 인 8080 를 사용 중
------------
#### vue.js 파일
  - springboot 와 연동되어있기 때문에 vue의 기본 경로가 아닌 src/main/resources 아래에 파일이 위치하고 있다.
    - 해당 내용은  vuefront/vue.config.js 에서 확인 가능
    - git에 src/main/resources/static 디렉토리 및 하위 파일들은 업로드 X


------------
## 프로젝트 구조 설명 추가
ahp, multi-faceted-evaluation(다면평가), satisfacion(만족도), survey(설문)의로 각각의 마이크로서비스용 springboot
### 각 서비스별 위치한 디렉토리 관련 설명
- domain(entity)
  - DB table과 1 : 1 매칭 되는 부분
- repository(DAO)
  - domain(entity)를 통해서 데이터를 DB에 저장하는 부분
- service
  - frontend 부분에서 로직을 처리할수 있도록 하는 부분
  - repository(DAO)에 정의된 로직을 처리하거나 domawin(entity)에 접근하는 부분
- controller
  - 클라이언트의 요청을 처리하는 부분
  - domain(entity) 서비스로 의해 추상화 직접 접근 X
  - ResponseBody에 데이터를 담아 반환
  - DTO(Data Transfer Object) class 위치
- 각 디렉토리 하위 resourcse 디렉토리 파일의 application.yml 파일에 springboot 포트 할당
# 멍시피(petkit 테스트 프로젝트)

1. 프로젝트 설명

    멍시피는 반려동물 간식 밀키트인 petkit 서비스에 대한 수요를 분석하고, 실제 상용화를 위한 과정을 체험하기 위한 테스트 모델입니다.
  
    따라서 테스트 모델에는 기존 서비스와는 달리 타겟 고객에 대한 시장 조사를 위한 설문지가 포함되어 있고, 이를 통해 소비자의 수요를 예측하고, 니즈를 분석합니다.
  
    해당 프로젝트는 테스트 모델의 backend 프로젝트입니다.

2. Architecture

  ![image](https://user-images.githubusercontent.com/20418155/172608349-debb44f1-b30f-4ba7-b164-7e0d8eb14d96.png)

3. 주요 개발 내용

  - DB 설계, 제작, 관리
  - 사용자, 주문, 설문 등에 대한 CRUD 쿼리 개발
  - Admin 페이지를 위한 기능 개발 (주문 처리, 배송 관련)
  - 개발한 프로젝트를 압축한 .war파일을 FileZilla를 활용해 Ec2 서버로 옮겨 배포


4. 특징

  - 서버에 MVC 패턴의 RESTful한 API를 제작하였으며, JDBC를 통해 쿼리 작성하였습니다.
  - 개발 이슈는 slack을 통해 팀원들과 공유하였습니다.
  - 해당 프로젝트는 서울대 융합과학기술원에서 지원을 받아 제작하였습니다.
  - 약 2개월간 개발하였으며, 테스트 진행 후 서비스 중단하였습니다.
  - 팀 구성 ― 기획자 1, 디자이너 1, 개발자 2

5. 실제 테스트 결과 및 분석

  ![image](https://user-images.githubusercontent.com/20418155/172610876-c4e091a6-5c7d-410e-9109-fece98571135.png)

  ![image](https://user-images.githubusercontent.com/20418155/172610949-83489783-9911-4ede-aefd-b9bae05ec210.png)

  ![image](https://user-images.githubusercontent.com/20418155/172610988-e3c05b13-afc1-4d27-a859-43c7ec593d0c.png)

  ![image](https://user-images.githubusercontent.com/20418155/172611037-69d79e3e-1046-4291-ab36-e617f1bf3a6f.png)

  ![image](https://user-images.githubusercontent.com/20418155/172611123-aea39755-383f-4498-bdfc-0fc3a3ce052f.png)

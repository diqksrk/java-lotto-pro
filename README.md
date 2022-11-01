# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## Step1 - 학습 테스트 실습

### String Class에 대한 학습 테스트
#### 요구사항 1
 - "1,2"를 ,로 split했을 때, 1과 2로 분리되어야 한다.
 - "1"을 ,로 split했을때, 1만을 포함하는 배열이 반환되어야 한다.

#### 요구사항 2
 - "(1,2)"값이 주어졌을때, ()를 제거하고 "1.2" 반환하여야 한다.
 
#### 요구사항 3
 - charAt을 사용해 특정위치값을 문자를 가져온다.
 - 위치값을 벗어난다면, StringIndexOutOfBoundsException이 발생되고 해당 부분을 테스트한다.
 - DisplayName을 활용해서, 테스트의 의도를 드러내야 한다.
 
### Set Collection에 대한 학습 테스트
#### 요구사항 1
 - size를 이용해 set의 사이즈를 확인한다.
 
#### 요구사항 2
 - Set에 1,2,3의 값이 존재하는지 확인한다. 메소드 작성에서 발생하는 중복코드를 제거한다.
 
#### 요구사항 3
 - 입력값에 따라, 결과값이 다르게 테스트를 구현한다.
 
 
## Step2 - 문자열 덧셈 계산기

#### 요구사항 1
 - 쉼표, 콜론을 구분자로 가지는 문자열을 전달하는 경우, 구분자를 기준으로 분리한 각숫자의 합을 반환
 
#### 요구사항 2
 - // 와 \n 사이의 커스텀 구분자를 지정할수 있다.

#### 요구사항 3
 - 음수를 전달하는 경우, RuntimeException을 반환한다. 

## Step3 - 로또( 자동 )
#### 기능 요구사항
- [ ] 로또 구매 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- [ ] 로도 1장의 가격은 1000원이다.

#### 구현 기능
- [x] 구매금액을 입력하라는 메시지를 출력한다.
- [x] 구입할 로또 금액을 입력한다.
    - [x] 구입할 로또 금액은 숫자여야 한다.
    - [x] 구입할 로또 금액은 1000단위여야 한다.
- [x] 구매한 로또 갯수를 출력한다.

- [x] 로또 번호를 6개 생성한다.
    - [x] 로또 번호는 1 ~ 45 사이의 숫자이다.
    - [x] 로또 번호는 중복되지 않는다.
- [x] 구매 내역(로또 번호)을 출력한다.

- [x] 지난 주 당첨 번호를 입력한다.
- [x] 당첨 통계를 계산한다.
    - [x] 3개 일치의 경우 5000원.
    - [x] 4개 일치의 경우 50000원.
    - [x] 5개 일치의 경우 1500000원.
    - [x] 6개 일치의 경우 2000000000원.
- [x] 당첨 통계를 출력한다.
- [x] 수익률을 계산한다.
    - [x] 수익률은 구매금액 대비 당첨금액의 비율로 정해지며, 소수점 둘째 자리까지 포함한다.
- [x] 수익률을 출력한다.

#### 리뷰 사항 반영
- [x] Step3 1차 리뷰 사항 반영
    - [x] 예외 처리 - RuntimeException을 상속 받도록 변경
    - [x] lottoNumbers.contains() 을 사용하도록 변경 ( 직접 정의 X )
    - [x] static 키워드 첨부
    - [x] 생성기가 필요한 로또 숫자 미리 생성
    - [x] static 키워드 첨부
    - [x] threeCount와 같은 요소 제거 및 ENUM key로 활용
    - [x] 대중적인 prefix인 print로 출력 메소드명 변경

#### 리뷰 사항 반영
- [x] ENUM - 숫자값 잘 보일수 있도록 단위당 _찍기

## Step4 - 로또( 2등 )
- [x] 보너스볼을 입력하라는 메시지를 출력한다.
- [x] 보너스볼을 입력한다.
  - [x] 보너스볼은 기존 로또 번호와 일치할수 없다.
  - [x] 보너스볼은 숫자 이외의 값을 가질수 없다.
  - [x] 보너스볼은 하나의 숫자이상으로 이루어지지 않는다.

- [x] 2등을 위해 추가 번호를 하나 더 추첨한다.
  - [x] 보너스 숫자가 일치하는지 확인한다.
  - [x] 일치한다면 결과값에 추가시킨다.

- [x] 당첨 통계에 2등도 추가해야 한다.
  - [x] 3개 일치의 경우 5000원.
  - [x] 4개 일치의 경우 50,000원.
  - [x] 5개 일치의 경우 1,500,000원.
  - [x] 5개 + 보너스볼 일치의 경우 30,000,000.
  - [x] 6개 일치의 경우 2,000,000,000원.
- [x] 당첨 통계를 출력한다.



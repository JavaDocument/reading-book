# 챕터 4

## 설계 품질과 트레이드오프
- 객체지향 설계란 무엇인가
  1. 객체에 올바른 책임 할당
  2. ⬇️결합도 ⬆️응집도


## 캡슐화
- 외부에서 알 수 없게 내부를 "숨겨준다"  ➡️ 어떤 것이라도 감춘다
- 변경으로 인한 영향 최소화
  - 즉, 변경으로부터 자유로워진다\
  
## 응집도
- 모듈 내부의 요소들이 서로 얼마나 연관되어있나?
- 높을수록 한 모듈만 수정하면 된다

## 결합도
- 한 모듈이 다른 모듈에 대해 얼마나 알고 있는가? (얼마나 의존하고 있느냐)
- 높을수록 변경해야 되는 더 많은 수의 코드를 수정해야 된다
- 응집도와 결합도는 **변경**과 연관되어 있다

## 데이터 중심 (절차지향적인) 설계의 문제
- 행동 < 상태
- 데이터를 결정하는 작업은 미루고 먼저 협럭이라는 문맥 안에서 책임을 할당해줘야 한다
- ❗ "어떻게 구현할까"보다 "객체가 어떻게 협력해야되나"를 고민해보자 ❗
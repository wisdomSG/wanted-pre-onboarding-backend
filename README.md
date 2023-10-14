# wanted-pre-onboarding-backend
### 요구사항 분석 및 구현 과정 
1. 채용공고 등록
   - JpaRepository의 save 메서드를 사용하여 DB에 등록
   - 회사id를 request로 받아 company와 recruitmentPost의 연관관계 매핑
2. 채용공고 수정
   - @Transactional을 사용하여 수정
   - setter를 사용하여 DB 수정 -> @Setter를 사용하지않고 필요한 필드만 set메서드 생성
3. 채용공고 삭제
   - @Transactional을 사용
   - JpaRepository의 delete 메서드 사용하여 DB에서 삭제  
4. 채용공고 목록
   - Spring Data JPA의 쿼리메서드 사용 : findAll() 
8. 채용 상세페이지
9. 사용자의 채용공고 지원

### 구현 과정 

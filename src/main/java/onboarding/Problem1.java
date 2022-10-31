package onboarding;

import java.util.List;
import java.util.stream.Collectors;

// TODO
// 1. 책을 임의로 펼친다.
// 2, 왼쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
// 3. 오른쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
// 4. 2~3 과정에서 가장 큰 수를 본인의 점수로 한다.
// 5. 점수를 비교해 가장 높은 사람이 게임의 승자가 된다.
// 6. 시작 면이나 마지막 면이 나오도록 책을 펼치지 않는다.
class Problem1 {
    /**
     * 주어진 페이지 리스트가 비어있다면 true, 아니라면 false를 반환한다.
     *
     * @param list 주어진 페이지 리스트
     * @return 비어있다면 true, 아니라면 false
     */
    public static boolean checkSize(List<Integer> list) {
        return list.isEmpty();
    }

    /**
     * 주어진 리스트에서 페이지의 범위를 벗어나는 페이지가 있다면 true, 아니라면 false를 반환한다.
     *
     * @param list 주어진 리스트
     * @return 페이지가 있다면 true, 아니라면 false
     */
    public static boolean checkPageBound(List<Integer> list) {
        List<Integer> outOfBounds = list.stream()
                .filter(x -> x > 400 || x < 1)
                .collect(Collectors.toList());
        return !outOfBounds.isEmpty();
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }
}

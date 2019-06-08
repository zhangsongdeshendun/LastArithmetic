package algorithm;

/**
 * 青蛙上台阶问题
 *
 */
public class JumpFloor {


    public int jumpFloor_Solutions(int target) {

        if (target == 2 || target == 1) {
            return target;
        }

        return jumpFloor_Solutions(target - 1) + jumpFloor_Solutions(target - 2);

    }


    public static void main(String[] args) {
        JumpFloor jumpFloor=new JumpFloor();
        System.out.println(jumpFloor.jumpFloor_Solutions(10));

    }
}

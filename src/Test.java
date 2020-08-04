import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test implements Comparable<Test>{

    public static void main(String[] args) {
        List<Test> testList = new ArrayList<>();
        testList.add(new Test(1));
        testList.add(new Test(111));
        testList.add(new Test(12));
        testList.add(new Test(166));
        System.out.println(testList);

//        Collections.sort(testList, Test.COMPARATOR);
        Collections.sort(testList);
        System.out.println(testList);
    }
    
    private TestMember testMember;
    
    public static final Comparator<Test> COMPARATOR = new Comparator<Test>() {
        
        
        @Override
        public int compare(Test o1, Test o2) {
            if (o1.getTestMember().getMember() > o2.getTestMember().getMember()) {
                return 1;
            }
            if (o1.getTestMember().getMember() < o2.getTestMember().getMember()) {
                return -1;
            }
            return 0;
        }
    };

    public Test(int testMember) {
        this.testMember = new TestMember(testMember);
    }

    public TestMember getTestMember() {
        return testMember;
    }

    public void setTestMember(TestMember testMember) {
        this.testMember = testMember;
    }

    @Override
    public int compareTo(Test o) {
        if (testMember.getMember() > o.getTestMember().getMember()) {
            return 1;
        }
        if (testMember.getMember() < o.getTestMember().getMember()) {
            return -1;
        }
        return 0;    }

    private class TestMember {
        
        private int member;

        public TestMember(int member) {
            this.member = member;
        }

        public int getMember() {
            return member;
        }

        public void setMember(int member) {
            this.member = member;
        }

        @Override
        public String toString() {
            return "TestMember{" +
                    "member=" + member +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Test{" +
                "testMember=" + testMember +
                '}';
    }
}

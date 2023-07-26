public abstract class Worker {

    public void executeRoutine(){
            getUp();
            eatBreakFast();
            goToWork();
            work();
            returnToHome();
            relax();
            sleep();
    }

    private void getUp(){
        System.out.println("Getting Up");
    }

    private void eatBreakFast(){
        System.out.println("Having breakfast");
    }

    private void goToWork(){
        System.out.println("Going to work");

    }

    abstract void work();

    private void returnToHome(){
        System.out.println("Going back home");
    }

    protected void relax(){
        System.out.println("Time to relax");
    }

    private void sleep(){
        System.out.println("Time to Sleep");
    }



}

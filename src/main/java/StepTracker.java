import java.util.ArrayList;
public class StepTracker
{
private int min, final;
 private int total, active;

 public StepTracker(int goal){
  min=0;
  final=0;
  total=0;
  active=0;
 }
 public void addDailySteps(int steps){
  final+=steps;
  total++
   if(steps>=min)
   active++;
 }
 public int activeDays(){
  return active;
 }
 public double averageSteps(){
  if(total==0)
   return 0.0;
  return (double)final/total;
 }
} 

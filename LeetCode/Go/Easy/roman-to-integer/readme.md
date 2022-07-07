# Summary
**Problem level**: Easy

**Time Spent**: 40 Minutes

**Description**

The result is quite satifsying,

> Runtime: 5 ms, faster than 87.68% of Go online submissions for Roman to Integer.
> 
> Memory Usage: 3.1 MB, less than 18.40% of Go online submissions for Roman to Integer.

The problem solving was done in badly time manner, this caused because I still refresh my memory Golang (I even forget how to semi-colon,  loop and rune (\*/ω＼*)). Overall this problem should be solved under 15 minute.

Even so, there is still room to improve....

**Solution**

1. Map all character into hashmap/disctionary
2. Process character by character with comparition with priority (M->D->C->L->X->V->I) to determine if the operation is need summation or subtitution

**Room to improve**

One thing that I noticed is that I *often* overthinking about the problem. Should've read the problem and test case slowly.

After explore another solution, I cannot improve my solution for better result and stuck with worse solution. 

Thus I open the discussion and re-evaluate my logic. By changing few of my logic (refer to: solution-after), I manage to get better result (*even though that it's not reach 100%*)

> Runtime: 4 ms, faster than 94.14% of Go online submissions for Roman to Integer.
> 
> Memory Usage: 2.9 MB, less than 81.26% of Go online submissions for Roman to Integer.
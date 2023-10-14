// TODO https://youtu.be/oFkDldu3C_4?list=PLq6-ywQkgRPG5T9lkNk2EUo-8LQnbkxe9&t=8514

const countingChange = (amount, coins) => {
  return countingChangeDS(amount, coins, {})
}


const countingChangeDS = (amount, coins, memo) => {
  if(amount == 0) return 1
  if(amount < 0) return 0
  if(amount in memo){
    return memo[amount]
  }

  let change = 0
  for(let i = 0; i< coins.length; i++)  {
    if(coins[i] > amount) continue

    change +=  countingChangeDS(amount - coins[i], coins, memo)
    console.log(`i: ${i} -- coins: ${coins[i]}`, change)
    
  }
  memo[amount] = change
  return change
}


let r = countingChange(4, [1, 2, 3])
console.log(r)





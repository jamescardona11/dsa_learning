

var combinationSum = function(candidates, target) {
    let result = []

    function dfs(index, arr, total){
        if(total === target) {
            
            // copy and add to result
            result.push([...arr])
        }

        for (let i = index; i < candidates.length; i++) {
            
            if(total + candidates[i] <= target) {
                
                arr.push(candidates[i])
                dfs(i, arr, total + candidates[i])
                arr.pop()
            }
            
        }
    }
    dfs(0, [], 0)

    return result
}




/// neetcode solution
var combinationSum2 = function(candidates, target) {
    let result = []

    function dfs(index, arr, total){
        if(total === target) {
            // copy and add to result
            result.push([...arr])
            return
        }

        if(index >= candidates.length ||  total > target) return

        arr.push(candidates[index])
        dfs(index, arr, total + candidates[index])
        arr.pop()
        
        dfs(index + 1, arr, total)
    }
    dfs(0, [], 0)

    return result
}




const r = combinationSum2([2,3,6,7], 7)

console.log(r)
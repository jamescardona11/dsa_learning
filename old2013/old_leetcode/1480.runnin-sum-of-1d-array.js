var runningSum = function (nums) {
  let output = [];
  if (!nums.length || nums.length === 1) return output;

  output[0] = nums[0];

  for (var i = 1; i < nums.length; i++) {
    output[i] = output[i - 1] + nums[i];
  }

  return output;
};

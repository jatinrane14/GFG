<h2><a href="https://www.geeksforgeeks.org/problems/license-key-formatting/1?page=1&category=Strings&company=Google&difficulty=Easy&sortBy=submissions">License Key Formatting</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p data-start="72" data-end="190"><span style="font-size: 18.6667px;">Given a string <strong>s </strong>consisting of alphanumeric characters and dashes ('-'), and an integer <strong>k</strong>, reformat the string according to the following rules:</span></p>
<ul>
<li data-start="72" data-end="190"><span style="font-size: 18.6667px;"><strong>Remove </strong>all dashes from the string.</span></li>
<li data-start="72" data-end="190"><span style="font-size: 18.6667px;">Convert all alphabetic characters to <strong>uppercase</strong>.</span></li>
<li data-start="72" data-end="190"><span style="font-size: 18.6667px;">Divide the remaining characters into groups of size <strong>k </strong>from right to left. If no characters remain after removing dashes, return an empty string.</span></li>
<li data-start="72" data-end="190"><span style="font-size: 18.6667px;">The first group may contain fewer than k characters.</span></li>
<li data-start="72" data-end="190"><span style="font-size: 18.6667px;"><strong>Join </strong>the groups using dashes ('-').</span></li>
</ul>
<p data-start="72" data-end="190"><span style="font-size: 18.6667px;">Return the resulting formatted string.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "5F3Z-2e-9-w", k = 4
<strong>Output: "</strong>5F3Z-2E9W"
<strong>Explanation:&nbsp;<br></strong>After removing all dashes and converting letters to uppercase, the string becomes "5F3Z2E9W".
Grouping the characters from right to left into groups of size 4 gives "5F3Z" and "2E9W".
Joining the groups with dashes results in "5F3Z-2E9W".</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "2-5g-3-J", k = 2
<strong>Output: </strong>"2-5G-3J"
<strong>Explanation:&nbsp;<br></strong>After removing all dashes and converting letters to uppercase, the string becomes "25G3J".
Grouping the characters from right to left into groups of size 2 gives "2", "5G", and "3J".
The first group contains fewer than k characters, which is allowed.
Joining the groups with dashes results in "2-5G-3J".
</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ |s| ≤ 10<sup>5</sup></span><br><span style="font-size: 18px;">1 ≤ k ≤ |s|</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Google</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;
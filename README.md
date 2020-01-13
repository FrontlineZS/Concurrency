# Creating clear, correct and well documented concurrent programs
<ol>
    <li>
        <p>There is a method in the library, but it has been outdated a long time ago, because it is not very secure, its use can damage data</p>
    </li>
    <li>
        <p>The problem is when there is no synchronization mechanism there is no guarantee when and whether the backgroundThread will notice changes in the stopRequest value</p>
    </li>
</ol>
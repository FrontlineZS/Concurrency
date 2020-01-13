# Creating clear, correct and well documented concurrent programs
<ol>
    <li>
        <p>There is a method in the library, but it has been outdated a long time ago, because it is not very secure, its use can damage data</p>
    </li>
    <li>
        <p>The problem is when there is no synchronization mechanism there is no guarantee when and whether the backgroundThread will notice changes in the stopRequest value</p>
    </li>
    <li>
        <p>In fact, synchronization has no effect if both read and write operations are not performed</p>
        <p>Synchronization of these two methods is used only to ensure communication, not mutual exclusion __ read and write operations are atomic</p>
    </li>
</ol>
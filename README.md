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
    <li>
        <p>Although the cost of performance in while iteration small, we got another way. Modificator volatile, do not ensure mutual exclusion but guarantees each thread will see latest written value.</p>
    </li>
    <li>
        <p>It will not works with ++ operator, because this operator is not atomic. Only single operation on available primitives are atomic. We need synchronized modifier will ensure parallel (read & write) calls will not overlap</p>
    </li>
    <li>
        <p>eventually, we can remove volatile modifier from int field __ moreover change int to long to get more available digits</p>
    </li>
    <li>
        <p>Even better is to use AtomicLong class from concurrent.atomic</p>
    </li>
</ol>